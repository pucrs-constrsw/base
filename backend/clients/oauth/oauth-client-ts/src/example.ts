import {AuthenticationControllerApiFp, RolesControllerApiFp, UsersControllerApiFp} from "./api.ts";
import axios from "axios";


const login = await AuthenticationControllerApiFp().login({email: "admin@pucrs.br", password: "a12345678"})

const getUsers = await UsersControllerApiFp().getUsers(undefined, undefined, undefined, undefined, undefined)
const getRoles = await RolesControllerApiFp().getRoles()

const accessToken = await login()

const authenticatedClient = axios.create({
    headers: {
        'Authorization': `Bearer ${accessToken.data.access_token}`
    }
})

console.log("users: ");

const [users, roles] = await Promise.allSettled([getUsers(authenticatedClient), getRoles(authenticatedClient)])

if (users.status === "rejected") {
    throw new Error(`error getting users: ${users.reason}`)
}

if (roles.status === "rejected") {
    throw new Error(`error getting roles: ${roles.reason}`)
}

console.log(users.value.data);

console.log("roles: ")
console.log(roles.value.data);

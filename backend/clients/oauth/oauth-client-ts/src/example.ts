import {AuthenticationControllerApiFp, RolesControllerApiFp, UsersControllerApiFp} from "./api.ts";
import axios from "axios";


const login = await AuthenticationControllerApiFp().login({email: "admin@pucrs.br", password: "a12345678"})

const getUsers = await UsersControllerApiFp().getUsers(undefined, undefined, undefined, undefined, undefined)
const getRoles = await RolesControllerApiFp().getRoles()

const accessToken = await login(axios.create())

const authenticatedClient = axios.create({
    headers: {
        'Authorization': `Bearer ${accessToken.data.access_token}`
    }
})

console.log("users: ");
console.log((await getUsers(authenticatedClient)).data);

console.log("roles: ")
console.log((await getRoles(authenticatedClient)).data);

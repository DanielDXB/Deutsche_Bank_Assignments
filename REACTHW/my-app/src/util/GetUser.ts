import { User } from "../model/User";
import axios from "axios";

const userUrl = "https://jsonplaceholder.typicode.com/users";

export const GetUser = {
    getAll: async (): Promise<User[]> => {
        const response = await axios.get(userUrl);
        return response.data;
    },

    getById: async (userId: string): Promise<User> => {
        const response  = await axios.get(userUrl, {
            params: { id: userId }
});
    return response.data[0];
}}
import {Post} from "../model/Post";
import axios from "axios";

const postUrl = "https://jsonplaceholder.typicode.com/posts";

export const GetPost = {
    getByUserId: async (userId: string): Promise<Post[]> => {
        const res = await axios.get(postUrl, {
            params: {
                userId: userId
            }
        });
        return res.data;
    }
}

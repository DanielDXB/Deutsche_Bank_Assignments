import { User } from "./User";

export interface Post {
    userId: string;
    id: number;
    title: string;
    body: string;
    user?: User;
}
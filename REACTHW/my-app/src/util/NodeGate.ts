import { createContext, useContext } from "react";

export const retContext = createContext({});

export function Node(): any {
    return useContext(retContext);
}

// export function Gate({children, ...util}) {
//     return (
//         <retContext.Provider value={util}>
//             {children}
//         </retContext.Provider>
//     )
// }
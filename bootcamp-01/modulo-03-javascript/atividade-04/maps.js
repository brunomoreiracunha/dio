function getAdmins(map){
    let admins = [];
    for ([user,key] of map) {
        if(key === "Admin"){
            admins.push(user);
        }
    }
    return admins;
}

const usuarios = new Map();

usuarios.set("Maria","Admin");
usuarios.set("Carlos","User");
usuarios.set("João","Admin");
usuarios.set("Carla","User");
usuarios.set("José","Admin");
usuarios.set("Claudio","User");
usuarios.set("Jaspíon","Admin");
usuarios.set("Cloves","User");

console.log(getAdmins(usuarios));
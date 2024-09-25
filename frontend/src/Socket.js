import { Manager, Manager } from "socket.io-client";

const manager = new Manager("ws://localhost:8080/api", {
    autoConnect : false
});

const socket = manager.socket("/socket");

manager.open((err) => {
    if(err) {
        console.log(err);
    } 
    // else {
    //     console.log(err);
    // }
})

socket.on('frame', (frame) => {
    console.log("receive msg");
})
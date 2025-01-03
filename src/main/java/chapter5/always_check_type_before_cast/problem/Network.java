package chapter5.always_check_type_before_cast.problem;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Network {

    ObjectInputStream inputStream;
    InterCom interCom;

    void listen() throws IOException, ClassNotFoundException {
        while (true) {
            Object signal = inputStream.readObject();
            CrewMessage crewMessage = (CrewMessage) signal;
            interCom.broadcast(crewMessage);
        }
    }
}

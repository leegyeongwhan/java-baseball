package baseball;

import baseball.controller.ConsoleController;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        ConsoleController controller = new ConsoleController();
        controller.gameStart();
    }


//    // 숫자 입력받는 함수
//    public ArrayList<Integer> InputNum() {
//        String playerNumString = Console.readLine();
//        return playerNum;
//    }
}

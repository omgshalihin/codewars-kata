package closestEnemy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

//    public static int ClosestEnemy(int[] arr) {
//        int playerPosition = 0;
//        int enemyPosition = 0;
//        var a = Arrays.asList(arr).indexOf(2);
//        System.out.println("hahaha"+a);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            if (arr[i] == 2) {
//                System.out.println("enemy: " + i);
//                enemyPosition = i;
//            }
//
//            else if (arr[i] == 1) {
//                System.out.println("player: " + i);
//                playerPosition = i;
//            }
//        }
//        return enemyPosition - playerPosition;
//    }

    public static int ClosestEnemy(int[] arr) {
        var player = 1;
        var enemy = 2;
        var closestDistance = 1000;
        var playerPosition = IntStream.range(0, arr.length).filter(index -> arr[index] == player).findFirst().orElse(-1);
        var allEnemyPositions = IntStream.range(0, arr.length).filter(index -> arr[index] == enemy).boxed().toList();
        System.out.println("player position: " + playerPosition);
        System.out.println("allEnemyPositions: " + allEnemyPositions);
        if (playerPosition == -1) {
            System.out.print("player is not present: ");
            return 0;
        }
        for (Integer enemyPosition : allEnemyPositions) {
            var distance = Math.abs(playerPosition - enemyPosition);
            if (closestDistance >= distance) {
                closestDistance = distance;
            }
        }
        System.out.print("The closest distance to enemy position is: ");
        return closestDistance;

    }

    public static void main(String[] args) {
        System.out.println(ClosestEnemy(new int[] {2, 0, 0, 0, 2, 2, 1, 0}));
//        System.out.println(ClosestEnemy(new int[] {0,0,0,2}));
    }
}

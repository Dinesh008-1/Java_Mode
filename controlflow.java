public class controlflow {

//varargs in java
    static void display(String name, int... marks) {

        System.out.println("Name: " + name);

        for (int mark : marks) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        int num = 10;
//Arrow switch
        String result = switch (num) {
            case 10 -> {
                System.out.println("Number is 10");
                yield "Ten";
            }

            case 20 -> {
                System.out.println("Number is 20");
                yield "Twenty";
            }

            default -> "Unknown";
        };
        System.out.println(result);
//Labelled break and continue
        outer:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break outer;
                }

                System.out.println(i + " " + j);
            }
        }
        outer:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    continue outer;
                }

                System.out.println(i + " " + j);
            }
        }


        //varargs input

        display("Dinesh", 90, 85, 95);
    }
}

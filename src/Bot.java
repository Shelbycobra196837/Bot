public class Bot {

    public static int FIELD_EDGE = 5;
    public static int FIELD_CELLS = FIELD_EDGE * FIELD_EDGE;

    public static void main(String[] args) {
        switch (args[0]) {
            case "init":
                System.out.println(setFleet());
                return;
            case "shoot":
                System.out.println(shoot(args[1]));
                return;
        }
    }

    public static String Flet;


    public static String setFleet() {
        if (Math.random() > 0.5) {
            return "0100000010020000200100000";
        } else {
            return "0100000010020000200000001";
        }
    }

    public static String getCode(int x, int y) {
        String str1 = Character.toString((char) (97 + x));
        String str2 = String.valueOf(y + 1);
        return str1 + str2;
    }

    public static String shoot(String fleet) {
        for (int i = 0; i < 25; i++) {
            Flet = fleet;
            StringBuilder myName = new StringBuilder(fleet);
            if (Flet.charAt(i) == 2) {
                if (i - 5 >= 0 && Flet.charAt(i - 5) == 0) {
                    myName.setCharAt(i - 5, '5');
                }
                if (i - 1 >= 0 && Flet.charAt(i - 1) == 0) {
                    myName.setCharAt(i - 1, '5');
                }
                if (i + 1 <= 25 && Flet.charAt(i + 1) == 0) {
                    myName.setCharAt(i + 1, '5');
                }
                if (i + 5 <= 25 && Flet.charAt(i + 5) == 0) {
                    myName.setCharAt(i + 5, '5');
                }
            }
            //описание логики взятия радиуса клеток (4 = радиус) , для двухпалубного корабля
            if (Flet.charAt(i) == 3) {
                if (i - 5 >= 0) {
                    if (Flet.charAt(i - 5) == 3) {
                        if (i - 11 >= 0) {
                            myName.setCharAt(i - 11, '4');
                        }
                        if (i - 10 >= 0) {
                            myName.setCharAt(i - 10, '4');
                        }
                        if (i - 9 >= 0) {
                            myName.setCharAt(i - 9, '4');
                        }
                        if (i - 6 >= 0) {
                            myName.setCharAt(i - 6, '4');
                        }
                        if (i - 4 >= 0) {
                            myName.setCharAt(i - 4, '4');
                        }
                        if (i - 1 >= 0) {
                            myName.setCharAt(i - 1, '4');
                        }
                        if (i + 1 <= 25) {
                            myName.setCharAt(i + 1, '4');
                        }
                        if (i + 4 <= 25) {
                            myName.setCharAt(i + 4, '4');
                        }
                        if (i + 5 <= 25) {
                            myName.setCharAt(i + 5, '4');
                        }
                        if (i + 6 <= 25) {
                            myName.setCharAt(i + 6, '4');
                        }

                    }
                }
                if (i + 5 <= 25) {
                    if (Flet.charAt(i + 5) == 3) {
                        if (i - 6 >= 0) {
                            myName.setCharAt(i - 6, '4');
                        }
                        if (i - 5 >= 0) {
                            myName.setCharAt(i - 5, '4');
                        }
                        if (i - 4 >= 0) {
                            myName.setCharAt(i - 4, '4');
                        }
                        if (i - 1 >= 0) {
                            myName.setCharAt(i - 1, '4');
                        }
                        if (i + 1 <= 25) {
                            myName.setCharAt(i + 1, '4');
                        }
                        if (i + 4 <= 25) {
                            myName.setCharAt(i + 4, '4');
                        }
                        if (i + 6 <= 25) {
                            myName.setCharAt(i + 6, '4');
                        }
                        if (i + 9 <= 25) {
                            myName.setCharAt(i + 9, '4');
                        }
                        if (i + 10 <= 25) {
                            myName.setCharAt(i + 10, '4');
                        }
                        if (i + 11 <= 25) {
                            myName.setCharAt(i + 11, '4');
                        }

                    }
                }
                if (i - 1 <= 0) {
                    if (Flet.charAt(i - 1) == 3) {
                        if (i - 7 >= 0) {
                            myName.setCharAt(i - 7, '4');
                        }
                        if (i - 6 >= 0) {
                            myName.setCharAt(i - 6, '4');
                        }
                        if (i - 5 >= 0) {
                            myName.setCharAt(i - 5, '4');
                        }
                        if (i - 4 >= 0) {
                            myName.setCharAt(i - 4, '4');
                        }
                        if (i - 2 >= 0) {
                            myName.setCharAt(i - 2, '4');
                        }
                        if (i + 1 <= 25) {
                            myName.setCharAt(i + 1, '4');
                        }
                        if (i + 3 <= 25) {
                            myName.setCharAt(i + 3, '4');
                        }
                        if (i + 4 <= 25) {
                            myName.setCharAt(i + 4, '4');
                        }
                        if (i + 5 <= 25) {
                            myName.setCharAt(i + 5, '4');
                        }
                        if (i + 6 <= 25) {
                            myName.setCharAt(i + 6, '4');
                        }


                    }
                }

                if (i + 1 <= 25) {
                    if (Flet.charAt(i + 1) == 3) {
                        if (i - 6 >= 0) {
                            myName.setCharAt(i - 6, '4');
                        }
                        if (i - 5 >= 0) {
                            myName.setCharAt(i - 5, '4');
                        }
                        if (i - 4 >= 0) {
                            myName.setCharAt(i - 4, '4');
                        }
                        if (i - 3 >= 0) {
                            myName.setCharAt(i - 3, '4');
                        }
                        if (i - 1 >= 0) {
                            myName.setCharAt(i - 1, '4');
                        }
                        if (i + 2 <= 25) {
                            myName.setCharAt(i + 2, '4');
                        }
                        if (i + 4 <= 25) {
                            myName.setCharAt(i + 4, '4');
                        }
                        if (i + 5 <= 25) {
                            myName.setCharAt(i + 5, '4');
                        }
                        if (i + 6 <= 25) {
                            myName.setCharAt(i + 6, '4');
                        }
                        if (i + 7 <= 25) {
                            myName.setCharAt(i + 7, '4');
                        }


                    }
                }

                // Резерв клеток однопалубного корабля
                if (i - 5 >= 0) {
                    if (Flet.charAt(i - 5) != 3) {
                        myName.setCharAt(i - 5, '4');
                    }
                }
                if (i - 1 >= 0) {
                    if (Flet.charAt(i - 1) != 3) {
                        myName.setCharAt(i - 1, '4');
                    }
                }
                if (i + 1 <= 25) {
                    if (Flet.charAt(i + 1) != 3) {
                        myName.setCharAt(i + 1, '4');
                    }
                }
                if (i + 5 <= 25) {
                    if (Flet.charAt(i + 5) != 3) {
                        myName.setCharAt(i + 5, '4');
                    }
                }
                if (i - 6 >= 0) {
                    myName.setCharAt(i - 6, '4');
                }
                if (i - 4 >= 0) {
                    myName.setCharAt(i - 4, '4');
                }
                if (i + 4 <= 25) {
                    myName.setCharAt(i + 4, '4');
                }
                if (i + 4 <= 25) {
                    myName.setCharAt(i + 6, '4');
                }
            }
                int rand = (int) (Math.random() * 25);
                //описание приоритетных ячеек
                if (myName.charAt(i) == 5) {
                    return getCode(i % FIELD_EDGE, i / FIELD_EDGE);
                } else if (myName.charAt(i)==4){
                    for (int o=0;o<FIELD_CELLS;o++) {
                        if (myName.charAt(o) == '0') {
                            return getCode(o % FIELD_EDGE, o / FIELD_EDGE);
                        }
                    }

                }else if(myName.charAt(i) == 3){
                    for (int o=0;o<FIELD_CELLS;o++) {
                        if (myName.charAt(o) == '0') {
                            return getCode(o % FIELD_EDGE, o / FIELD_EDGE);
                        }
                    }

                }else if(myName.charAt(i) == 1){
                    for (int o=0;o<FIELD_CELLS;o++) {
                        if (myName.charAt(o) == '0') {
                            return getCode(o % FIELD_EDGE, o / FIELD_EDGE);
                        }
                    }

                }else if (myName.charAt(i) == '0') {
                    return getCode(i % FIELD_EDGE, i / FIELD_EDGE);
                }




        }

        return "GAME OVER";
    }

}

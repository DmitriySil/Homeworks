package Homework;
/*Даны два слова и словарь (массив слов). Необходимо найти алгоритм превращения в другое,
меняя за один шаг одну букву, причем каждое новое слово должно быть в словаре (массиве слов).
Например,даны слова "hit" и "cog" и словарь(массив слов) ["hot", "dot", "dog", "log", "lot"].
 Один из вариантов цепочки: "hit"->"hot"->"dot"->"dog"->"cog".*/
public class string5 {
    public static void main(String[] args) {
//      Я не уверен,что правильно все понял и сделал,но потратил я на это кучу времени:)
        String str = "hit";
        String str1 = "cog";
        System.out.print(str);
        String[] stArr = {"dot", "hot", "dog", "log", "lot", "hit", "cog", "hog"};
        str = str.replace('i', 'o');
        for (int i = 0; i < stArr.length; i++) {
            if (stArr[i].equals(str)) {
                System.out.print( "=>" + stArr[i]);
            }

            if (!stArr[i].equals(str))
                continue;
            if (!stArr[i].equals("hog")){
            str = str.replace('t', 'g');}
            if (!stArr[i].equals(str))
                continue;
            str = str1;
               if (stArr[i].equals(str1)){
                   break;
               }
               i = 0;


        }
    }
}
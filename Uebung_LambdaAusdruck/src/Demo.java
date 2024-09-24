public class Demo {
    Calculator add = ((number1, number2) -> number1 + number2); //Links 2 Parameter (Name egal) und nach dem Pfeil kommt die funktionalität.
    Calculator substract = ((number1, number2) -> number1 - number2);

    public int add(int number1, int number2){
        return add.calculator(number1, number2);
    }

    public int substract(int number1, int numebr2){
        return substract.calculator(number1,numebr2);
    }

    //TextFormater

    TextFormater textFormater;

    public void setTextFormater(TextFormater textFormater){
        this.textFormater = textFormater;
    }

    public  String formatText(String text){
        return textFormater.format(text);
    }

    //Mapper

    GenericMapper<Float> mapFloat = param -> "This is a float: " + param.toString();
    GenericMapper<Integer> mapInteger = param -> "This is a Integer: " + param.toString();
}

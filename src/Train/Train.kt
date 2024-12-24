package Train
import kotlin.random.Random

fun main() {
    println("EXIT - выход. help - узнать список команд")
    var comand: String;
    var Marsrut: String = "Non";
    var pasangers: Int = 0;
    var vagons: Int = 0;
    pasangers = 0;
    println("Что вы хотите сделать:")
    println("1) Создать направление.")
    println("2) Продать билеты")
    println("3) Сформирорвать поезд")
    println("4) Отпрвить поезд")


    while (true){
        comand = readLine() ?: ""
        when (comand) {
            "1" -> Marsrut = CreateWay();
            "2" -> pasangers = SelTicket();
            "3" -> vagons = CreateTrain(pasangers);
            "4" -> RunTrain(Marsrut, pasangers, vagons);
            "EXIT" -> break;
            "exit" -> break;
            "выход" ->break;
            "Выход" ->break;
            "help" -> HelpComand();
            else -> {
                println("Неизвестная команда")
            }

        }
    }
    println("Программа завершена")
}


fun RunTrain(Marsrut:String, pasangers: Int, vagons:Int){
if (pasangers == 0){ println("Сначала продайте билеты на поезд!")}
else if(vagons == 0){}
else if(Marsrut == "Non"){}
    else{println("поезд "+Marsrut+" состоящий из "+vagons+" вагонов c "+pasangers+" пасажиров отправлен") }
    println("Что вы хотите сделать дальше11:")
}

fun SelTicket(): Int {
var pasangers:Int=  Random.nextInt(5, 201)
    var forPrint = pasangers.toString()
    println(forPrint + " пасажира купили билет");
    return  pasangers;
}

fun CreateTrain(pasangers: Int): Int{
    var vagons:Int = 0;
    var pass : Int = pasangers

    if(pasangers == 0)
    {
    println("Неизвестно колличество пассажиров, сначала продайте билеты")
        return 0;
    }else {

        while (pass > 0) {
           pass =  pass  - Random.nextInt(5, 25);
            vagons++
        }

        println("был сформирован поезд из " + vagons + " вагонов")
    }
return vagons;
}
fun CreateWay(): String{
    val cities = listOf(
        "Москва","Санкт-Петербург","Новосибирск","Екатеринбург","Нижний Новгород",
        "Казань","Челябинск","Омск","Ростов-на-Дону", "Уфа","Краснодар","Воронеж",
        "Пермь","Тюмень","Ижевск")

    val firstCityIndex = Random.nextInt(cities.size)
    var secondCityIndex = Random.nextInt(cities.size)
    while (secondCityIndex ==firstCityIndex){secondCityIndex = Random.nextInt(cities.size)}

    val Marshrut: String = cities[firstCityIndex] +"->"+ cities[secondCityIndex];
    println("Построен маршрут "+Marshrut)

    return Marshrut;
}
fun HelpComand(){
    println("EXIT - выход")

    println("1 -  Создать направление.")
    println("2 - Продать билеты")
    println("3 - Сформирорвать поезд")
    println("4 - Отпрвить поезд")
}
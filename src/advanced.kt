fun main(){
    var supply = arrayOf("Super Smash Bros. Melee","Pokémon Colosseum","Kirby Air Ride", "The Legend of Zelda: The Wind Waker","Paper Mario: The Thousand Year Door")
    var qty = arrayOf("4","3","7","14","6")

    println("Welcome to the GameCube shop. What game were you looking for?")
    var userSearch = readLine()
    if (userSearch == "Super Smash Bros. Melee")
        println("We have ${qty[0]} copies of ${supply[0]} in stock.")
        println("Did you want to buy or sell a copy?")
        var userBoS = readLine()
        if (userBoS == "buy")
            (qty[0] - 1)
            println("We have ${qty[0]} copies of ${supply[0]} in stock.")

    for (i in 0..supply.size -1){
        println("We have ${qty[i]} copies of ${supply[i]} in stock.")
    }

    // arrayOf an array
    var combArray = arrayOf<Array<String>>()

    combArray+= supply
    combArray+= qty
    var rowcount = combArray[0].size -1
    //to find items in first position [0] of array in combArray
    for (i in 0..rowcount){
        var a_item = combArray[0][i]
        var a_qty = combArray[1][i]
        println("In combine array: $a_item has $a_qty items.")
    }

}
const val FIRST_TYPE_COUNT = "Master card and Maestro"
const val SECOND_TYPE_COUNT = "Visa and Mir"
const val THIRD_TYPE_COUNT = "VK Pay"

fun main(args: Array<String>) {
    val amountTransfer = 70_000
    var amountTransferCount = 0
    val commision =moneyTransfer(FIRST_TYPE_COUNT, amountTransferCount,amountTransfer)
    println("Коммисия составляет $commision копеек")
}

fun moneyTransfer(typeCount:String=THIRD_TYPE_COUNT,totalLastTransferMonth:Int = 0,transferAmount:Int):Int{
    return when (typeCount){
        FIRST_TYPE_COUNT-> if (totalLastTransferMonth>30_000 && totalLastTransferMonth<7_500_000){0}else{transferAmount/10_000*6+2_000}
        SECOND_TYPE_COUNT-> {
            var commision = transferAmount/10_000*75
            if (commision<3_500){3_500}else{commision}
        }
        else -> 0
    }
}
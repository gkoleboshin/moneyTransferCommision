import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun should_culation_of_the_commission_for_master_card_type_if_do_not_have_last_baying(){
        val amountTransfer = 70_000
        val expectedCommision = 2042
        val actualCommision = moneyTransfer(FIRST_TYPE_COUNT, transferAmount = amountTransfer)
        assertEquals(expectedCommision,actualCommision)
    }
    @Test
    fun should_culation_of_the_commission_for_master_card_type_if_have_last_baying(){
        val amountTransfer = 70_000
        val amountTransferCount = 36_000
        val expectedCommision = 0
        val actualCommision = moneyTransfer(FIRST_TYPE_COUNT,amountTransferCount,amountTransfer)
        assertEquals(expectedCommision,actualCommision)
    }

    @Test
    fun should_culation_of_the_commission_for_visa_type_if_commision_the_bigger_then_35_rubls(){
        val amountTransfer = 750_000
        val expectedCommision = 5_625
        val actualCommision = moneyTransfer(SECOND_TYPE_COUNT, transferAmount = amountTransfer)
        assertEquals(expectedCommision,actualCommision)
    }

    @Test
    fun should_culation_of_the_commission_for_visa_type_if_commision_is_35_rubls(){
        val amountTransfer = 1_000
        val expectedCommision = 3_500
        val actualCommision = moneyTransfer(SECOND_TYPE_COUNT, transferAmount = amountTransfer)
        assertEquals(expectedCommision,actualCommision)
    }

    @Test
    fun should_culation_of_the_commission_for_VK_Pay_type(){
        val amountTransfer = 1_000
        val expectedCommision = 0
        val actualCommision = moneyTransfer(THIRD_TYPE_COUNT, transferAmount = amountTransfer)
        assertEquals(expectedCommision,actualCommision)
    }

}
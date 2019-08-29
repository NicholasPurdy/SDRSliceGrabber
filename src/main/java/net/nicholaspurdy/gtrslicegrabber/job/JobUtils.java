package net.nicholaspurdy.gtrslicegrabber.job;

class JobUtils {

    static final String[] FIELD_NAMES = {
        "DISSEMINATION_ID",
        "ORIGINAL_DISSEMINATION_ID",
        "ACTION",
        "EXECUTION_TIMESTAMP",
        "CLEARED",
        "INDICATION_OF_COLLATERALIZATION",
        "INDICATION_OF_END_USER_EXCEPTION",
        "INDICATION_OF_OTHER_PRICE_AFFECTING_TERM",
        "BLOCK_TRADES_AND_LARGE_NOTIONAL_OFF_FACILITY_SWAPS", // BLOCK_TRADES_AND_LARGE_NOTIONAL_OFF-FACILITY_SWAPS
        "EXECUTION_VENUE",
        "EFFECTIVE_DATE",
        "END_DATE",
        "DAY_COUNT_CONVENTION",
        "SETTLEMENT_CURRENCY",
        "ASSET_CLASS",
        "SUB_ASSET_CLASS_FOR_OTHER_COMMODITY", // SUB-ASSET_CLASS_FOR_OTHER_COMMODITY
        "TAXONOMY",
        "PRICE_FORMING_CONTINUATION_DATA",
        "UNDERLYING_ASSET_1",
        "UNDERLYING_ASSET_2",
        "PRICE_NOTATION_TYPE",
        "PRICE_NOTATION",
        "ADDITIONAL_PRICE_NOTATION_TYPE",
        "ADDITIONAL_PRICE_NOTATION",
        "NOTIONAL_CURRENCY_1",
        "NOTIONAL_CURRENCY_2",
        "ROUNDED_NOTIONAL_AMOUNT_1", // may need to be String due to presence of '+' character
        "ROUNDED_NOTIONAL_AMOUNT_2", // same as above
        "PAYMENT_FREQUENCY_1",
        "PAYMENT_FREQUENCY_2",
        "RESET_FREQUENCY_1",
        "RESET_FREQUENCY_2",
        "EMBEDED_OPTION",
        "OPTION_STRIKE_PRICE",
        "OPTION_TYPE",
        "OPTION_FAMILY",
        "OPTION_CURRENCY",
        "OPTION_PREMIUM",
        "OPTION_LOCK_PERIOD",
        "OPTION_EXPIRATION_DATE",
        "PRICE_NOTATION2_TYPE",
        "PRICE_NOTATION2",
        "PRICE_NOTATION3_TYPE",
        "PRICE_NOTATION3"
    };

    static final String INSERT_STATEMENT = "INSERT INTO $TABLE (FILE_ID,CANCELED_BY,CORRECTED_BY,DISSEMINATION_ID,ORIGINAL_DISSEMINATION_ID,ACTION,EXECUTION_TIMESTAMP,CLEARED,INDICATION_OF_COLLATERALIZATION,INDICATION_OF_END_USER_EXCEPTION,INDICATION_OF_OTHER_PRICE_AFFECTING_TERM,BLOCK_TRADES_AND_LARGE_NOTIONAL_OFF_FACILITY_SWAPS,EXECUTION_VENUE,EFFECTIVE_DATE,END_DATE,DAY_COUNT_CONVENTION,SETTLEMENT_CURRENCY,ASSET_CLASS,SUB_ASSET_CLASS_FOR_OTHER_COMMODITY,TAXONOMY,PRICE_FORMING_CONTINUATION_DATA,UNDERLYING_ASSET_1,UNDERLYING_ASSET_2,PRICE_NOTATION_TYPE,PRICE_NOTATION,ADDITIONAL_PRICE_NOTATION_TYPE,ADDITIONAL_PRICE_NOTATION,NOTIONAL_CURRENCY_1,NOTIONAL_CURRENCY_2,ROUNDED_NOTIONAL_AMOUNT_1,ROUNDED_NOTIONAL_AMOUNT_2,PAYMENT_FREQUENCY_1,PAYMENT_FREQUENCY_2,RESET_FREQUENCY_1,RESET_FREQUENCY_2,EMBEDED_OPTION,OPTION_STRIKE_PRICE,OPTION_TYPE,OPTION_FAMILY,OPTION_CURRENCY,OPTION_PREMIUM,OPTION_LOCK_PERIOD,OPTION_EXPIRATION_DATE,PRICE_NOTATION2_TYPE,PRICE_NOTATION2,PRICE_NOTATION3_TYPE,PRICE_NOTATION3) VALUES(?,:CANCELED_BY,:CORRECTED_BY,:DISSEMINATION_ID,:ORIGINAL_DISSEMINATION_ID,:ACTION,:EXECUTION_TIMESTAMP,:CLEARED,:INDICATION_OF_COLLATERALIZATION,:INDICATION_OF_END_USER_EXCEPTION,:INDICATION_OF_OTHER_PRICE_AFFECTING_TERM,:BLOCK_TRADES_AND_LARGE_NOTIONAL_OFF_FACILITY_SWAPS,:EXECUTION_VENUE,:EFFECTIVE_DATE,:END_DATE,:DAY_COUNT_CONVENTION,:SETTLEMENT_CURRENCY,:ASSET_CLASS,:SUB_ASSET_CLASS_FOR_OTHER_COMMODITY,:TAXONOMY,:PRICE_FORMING_CONTINUATION_DATA,:UNDERLYING_ASSET_1,:UNDERLYING_ASSET_2,:PRICE_NOTATION_TYPE,:PRICE_NOTATION,:ADDITIONAL_PRICE_NOTATION_TYPE,:ADDITIONAL_PRICE_NOTATION,:NOTIONAL_CURRENCY_1,:NOTIONAL_CURRENCY_2,:ROUNDED_NOTIONAL_AMOUNT_1,:ROUNDED_NOTIONAL_AMOUNT_2,:PAYMENT_FREQUENCY_1,:PAYMENT_FREQUENCY_2,:RESET_FREQUENCY_1,:RESET_FREQUENCY_2,:EMBEDED_OPTION,:OPTION_STRIKE_PRICE,:OPTION_TYPE,:OPTION_FAMILY,:OPTION_CURRENCY,:OPTION_PREMIUM,:OPTION_LOCK_PERIOD,:OPTION_EXPIRATION_DATE,:PRICE_NOTATION2_TYPE,:PRICE_NOTATION2,:PRICE_NOTATION3_TYPE,:PRICE_NOTATION3)";

}
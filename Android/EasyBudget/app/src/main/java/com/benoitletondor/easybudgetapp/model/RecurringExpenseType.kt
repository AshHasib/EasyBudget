package com.benoitletondor.easybudgetapp.model

/**
 * Type of recurring expense.
 *
 * **Important**: do not change the order of those fields since its used to display choices to the user.
 *
 * @author Benoit LETONDOR
 */
enum class RecurringExpenseType {
    /**
     * An expense that occurs every week
     */
    WEEKLY,

    /**
     * An expense that occurs every 2 weeks
     */
    BI_WEEKLY,

    /**
     * An expense that occurs every month
     */
    MONTHLY,

    /**
     * An expense that occurs once a year
     */
    YEARLY
}
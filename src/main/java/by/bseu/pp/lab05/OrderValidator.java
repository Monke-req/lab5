package by.bseu.pp.lab05;

public final class OrderValidator {
    private OrderValidator() { }

    /** Проверка идентификатора заказа. */
    public static void validateId(String id) {
        if (id == null || id.isBlank()) {
            throw new ValidationException(
                    "Некорректный id заказа: значение должно быть непустым"
            );
        }
    }

    /** Проверка суммы заказа. */
    public static void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new ValidationException(
                    "Некорректная сумма amount=" + Double.toString(amount)
                            + ": требуется конечное число больше 0"
            );
        }
    }
}

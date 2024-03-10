package com.pot.app.catalogservice.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public record Book(
        @NotBlank(message = "Необходимо определить ISBN книги.")
        @Pattern(
                regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "Формат ISBN должен быть действительным."
        )
        String isbn,
        @NotBlank(message = "Необходимо указать название книги.")
        String title,
        @NotBlank(message = "Необходимо указать автора книги.")
        String author,
        @NotNull(message = "Необходимо указать цену книги.")
        @Positive(message = "Цена книги должна быть больше нуля.")
        Double price
) {
}


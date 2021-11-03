package microservices.book.gamification.game.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Enumeration with the different types of Badges that a user can win
 * @implNote Only add new values at the end as they are saved as ordinal
 */
@RequiredArgsConstructor
@Getter
public enum BadgeType {
    // Badges depending on score
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("gold"),
    // Other badges won for different conditions
    FIRST_WON("First time"),
    LUCKY_NUMBER("Lucky number");

    private final String description;
}

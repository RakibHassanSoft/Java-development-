/*
 * 26. Create a GymMember class with name, membershipType, and expiryDate (as String). Display members with expired memberships based on today’s date (input manually).
 */

package Third10;
import java.time.LocalDate;

public class GymMember {
    String name, membershipType;
    // "yyyy-MM-dd"
    String expiryDate; 

    GymMember(String name, String type, String expiry) {
        this.name = name;
        this.membershipType = type;
        this.expiryDate = expiry;
    }

    boolean isExpired(LocalDate today) {
        LocalDate expiry = LocalDate.parse(expiryDate);
        return expiry.isBefore(today);
    }
}

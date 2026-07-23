package vn.vinhthai.recall.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
@Id
@GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String email;
    @Column(name = "full_name", nullable = false)
    private String fullName;
    private String password;
    @Column(name = "avatar_url")
    private String avatarUrl;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}

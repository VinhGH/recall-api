package vn.vinhthai.recall.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.vinhthai.recall.user.Role;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserResponse {

    private UUID id;
    private String fullName;
    private String email;
    private String avatarUrl;
    private Role role;
    private LocalDateTime createdAt;
}

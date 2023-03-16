package com.abdullah_aladham.kalemati.Registeration.Token;

import com.abdullah_aladham.kalemati.Model.AppUser;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {
    @Id
    @SequenceGenerator(name="confirmation_token_generator",
            sequenceName ="confirmation_token_generator",
            allocationSize=1)
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
            generator = "confirmation_token_generator")
    private Long Id;
    @Column(nullable = false)
    private String token;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime ExpiresAt;
    @Column(nullable = false)
    private LocalDateTime ConfirmedAt;
    @ManyToOne
    @JoinColumn(
            nullable = false,
            name="app_user_Id"
    )
    private AppUser appuser;
    public ConfirmationToken(String token, LocalDateTime createdAt,
                             LocalDateTime expiredAt,
                             AppUser appuser
) {
        this.token = token;
        this.createdAt = createdAt;
        ExpiresAt = expiredAt;
        this.appuser=appuser;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getExpiresAt() {
        return ExpiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        ExpiresAt = expiresAt;
    }

    public   LocalDateTime getConfirmedAt() {
        return ConfirmedAt;
    }

    public void setConfirmedAt(LocalDateTime confirmedAt) {
        ConfirmedAt = confirmedAt;
    }

    public AppUser getAppuser() {
        return appuser;
    }

    public void setAppuser(AppUser appuser) {
        this.appuser = appuser;
    }

}

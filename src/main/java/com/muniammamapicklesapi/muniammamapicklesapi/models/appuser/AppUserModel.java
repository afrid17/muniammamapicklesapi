package com.muniammamapicklesapi.muniammamapicklesapi.models.appuser;

import java.time.Instant;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "app_users")
/**
 * AppUserModel is a model class that represents an application user.
 * It contains various fields related to the user's information.
 */
public class AppUserModel {
    private String firstName;
    private String lastName;
    private String emailId;
    private String password;
    private String mobileNumber;
    private Integer otp;
    private boolean googleSignUp;
    private String profileUrl;
    private boolean firstTimeLogin = true;
    ResetPassword resetPassword;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}

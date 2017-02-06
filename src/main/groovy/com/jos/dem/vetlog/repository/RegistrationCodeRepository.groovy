package com.jos.dem.vetlog.repository

import com.jos.dem.vetlog.model.RegistrationCode
import org.springframework.data.jpa.repository.JpaRepository

interface RegistrationCodeRepository extends JpaRepository<RegistrationCode,Long> {

  String findEmailByToken(String token)
  RegistrationCode save(RegistrationCode registrationCode)

}

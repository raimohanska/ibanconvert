package ibanconvert

object IBANConvert {
  def convertFinnishToIBAN(accountNumber: String): String = {
    "FI" + calculateCheckSum(accountNumber) + accountNumber
  }

  private def calculateCheckSum(accountNumber: String) = {
      // "FI" in numeric format as defined in http://www.fkl.fi/teemasivut/sepa/tekninen_dokumentaatio/Dokumentit/IBAN_tilinumero_ohjelmistotaloille.pdf
     val numericCountry = "1518"
     val fullAccountNumber = accountNumber + numericCountry + "00"
     val mod97 = BigInt(fullAccountNumber) % 97
     val checkSum = 98 - mod97
     if (checkSum < 10) { "0" + checkSum } else { checkSum.toString }
  }
}

package ibanconvert

import org.specs2.mutable._

class IBANConverterSpec extends Specification {
  "For any Finnish bank account number" should {
    "IBAN is generated correctly" in {
      IBANConvert.convertFinnishToIBAN("50470760950018") must_== "FI3850470760950018"
      IBANConvert.convertFinnishToIBAN("12995000193760") must_== "FI2512995000193760"
      IBANConvert.convertFinnishToIBAN("31313003299328") must_== "FI7431313003299328"
      IBANConvert.convertFinnishToIBAN("66010003266996") must_== "FI8266010003266996"
    }
  }
}

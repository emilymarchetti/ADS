#include <IRremote.h>

int irPin = 11;
float resultado;
int redPin = 7;
int greenPin = 5;
IRrecv irrecv(irPin);
decode_results leitura;

void setup() {
  // put your setup code here, to run once:
   pinMode(redPin, OUTPUT);
   pinMode(greenPin, OUTPUT);
   Serial.begin(9600);
   irrecv.enableIRIn();
}

void loop() {
  // put your main code here, to run repeatedly:
   if (irrecv.decode(&leitura)) {
      Serial.print("valor recebido: ");
      Serial.println(leitura.value, HEX);
      resultado = (leitura.value);
      if (resultado == 0xFD08F7) {
         digitalWrite(redPin, HIGH);
      }
      if (resultado == 0xFD8877) {
        digitalWrite(redPin, LOW);
      }
      if (resultado == 0xFD28D7) {
        digitalWrite(greenPin, HIGH);
      }
      if (resultado == 0xFDA857) {
        digitalWrite(greenPin, LOW);
      }
      if (resultado == 0xFD18E7) {
        digitalWrite(redPin, LOW);
        digitalWrite(greenPin, LOW);
      }
      irrecv.resume();
   }
}

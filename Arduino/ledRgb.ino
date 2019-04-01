int valorBrilho = 0;
int pinLED = 11;
void setup()
{
   pinMode (pinLED, OUTPUT);
   analogWrite(pinLED, 0);
   Serial.begin (9600);
}
void loop() {
  Serial.println(valorBrilho);
  if (valorBrilho < 255) {
    valorBrilho++;
    analogWrite (pinLED, valorBrilho);
    delay(30);
  }
  else
  {
    valorBrilho = 0;
    analogWrite (pinLED, valorBrilho);
    delay(30);
  }
}
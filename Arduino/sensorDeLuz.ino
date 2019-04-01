int ledPin = 10;
int ldrPin = 0;
int ldrValor = 0;
int tempPin = 11;
int tempValor = 0;
void setup() 
{
   pinMode (ledPin, OUTPUT);
   pinMode (tempPin, INPUT);
   Serial.begin (9600);
}
/*void loop() {
  ldrValor = analogRead(ldrPin);
  tempValor = analogRead(tempPin);
  if (ldrValor >= 800) {
    digitalWrite (ledPin, HIGH);
    delay(100);
    digitalWrite (ledPin, LOW);
    delay(100);
  }
  else
  {
    digitalWrite(ledPin, LOW);
  }
  Serial.println(ldrValor);
  delay(100);
}*/

void loop(){
  
 tempValor = analogRead(tempPin);
  
  if (tempValor >= 100) {
    digitalWrite (ledPin, HIGH);
    delay(100);
  }
  else
  {
    digitalWrite(ledPin, LOW);
  }
  Serial.println(tempValor);
  delay(100);
}
  
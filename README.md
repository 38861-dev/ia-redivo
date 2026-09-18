Victor hugo minchin e Andrey vinicios

1:
São 2 classes concretas:

Violao

Bateria

2:
Atributos presentes em todos os instrumentos:

nome

material

afinado

3:
Atributos exclusivos:

Violao: quantidade de cordas (int)

Bateria: quantidade de tambores (int)

4:
Comportamentos:

Diferente para cada instrumento → tocar(), portanto método abstrato.

Igual para todos → afinar(), portanto método concreto na classe abstrata.

5:
Impedir a criação de um instrumento genérico:
Usar a palavra-chave abstract na classe InstrumentoMusical. Assim, não é possível fazer new InstrumentoMusical(...).

6:
Tipo da lista:
List<InstrumentoMusical>, pois tanto Violao quanto Bateria são subclasses de InstrumentoMusical. Isso permite percorrê-los usando polimorfismo, sem instanceof ou cast.
# Perguntas e Respostas para Apresentação - Observer Telephone

### Pergunta:
Quem é o Subject no padrão?

### Resposta:
O telefone (`PhoneModel`) é o Subject porque guarda os observadores e envia notificações quando ocorre uma mudança (inserção de um novo dígito).

---

### Pergunta:
Quem são os Observers?

### Resposta:
São os objetos criados pela `Screen` que recebem avisos quando um novo dígito é inserido.

---

### Pergunta:
Por que o telefone não conhece a Screen?

### Resposta:
Porque isso deixaria o código acoplado. O telefone apenas conhece a interface do observador (`PhoneObserver`), permitindo que a exibição mude sem precisar alterar o telefone.

---

### Pergunta:
Como adicionar um novo observador?

### Resposta:
Basta criar uma nova classe que implemente a interface Observer e registrar no telefone através do método `addObserver()`. O código do telefone não precisará ser alterado.

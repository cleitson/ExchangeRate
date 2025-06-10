# Conversor de Moedas

Um projeto Java simples para converter moedas usando a API [ExchangeRate-API](https://www.exchangerate-api.com/). Permite converter valores entre moedas como USD, BRL, EUR, ARS e outras, com uma interface de linha de comando.

## Como Configurar

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/cleitson/ExchangeRateApi
   ```

2. **Abra no IntelliJ IDEA**:
   - Selecione `File > Open` e escolha a pasta do projeto.

3. **Adicione o Gson**:
   - Vá em `File > Project Structure > Modules > Dependencies`.
   - Clique em `+` > `JARs or Directories` e selecione `lib/gson-2.11.0.jar`.

4. **Configure a chave da API**:
   - Obtenha uma chave gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/).
   - No IntelliJ, vá em `Run > Edit Configurations`.
   - Em `Environment variables`, adicione: `API_KEY=sua-chave-aqui`.

5. **Execute o projeto**:
   - Compile: `Build > Build Project`.
   - Execute: `Run > Run 'Main'`.

## Como Usar

O programa exibe um menu no console:
```
Bem-vindo ao conversor de moedas
1 - Dólar => Real Brasileiro
2 - Real Brasileiro => Dólar
3 - Dólar => Peso Argentino
4 - Peso Argentino => Dólar
5 - Dólar => Euro
6 - Euro => Dólar
7 - Outras moedas
9 - Sair
Escolha uma opção: 
```

- Escolha uma opção (1 a 9).
- Insira o valor a converter (ex.: `100.50`).
- Para a opção 7, informe os códigos de moeda (ex.: `USD`, `BRL`).
- Exemplo de saída: `100.00 USD = 512.34 BRL (taxa: 5.1234)`.

## Dependências

- **Java 17+**: Necessário para o projeto.
- **Gson 2.11.0**: Incluído em `lib/gson-2.11.0.jar`.

## Solução de Problemas

- **Erro "API_KEY não está definida"**: Configure a variável de ambiente `API_KEY`.
- **Códigos de moeda inválidos**: Use códigos de 3 letras em maiúsculas (ex.: USD, BRL).
- **Entrada inválida**: Insira números válidos para o valor (ex.: 100.50).
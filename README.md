# 🏦 Desafio Backend Itaú - API de Transações

> 🔗 **Baseado no projeto original:** [feltex/desafio-itau-backend](https://github.com/feltex/desafio-itau-backend)

## 📋 Visão Geral
API REST para processamento de transações financeiras com cálculo de estatísticas em tempo real, desenvolvida como solução ao desafio técnico do Itaú.

## 🚀 Tecnologias
| Componente       | Tecnologia                 |
|------------------|----------------------------|
| Linguagem        | Java 17                    |
| Framework        | Spring Boot 3.2.0          |
| Build            | Maven                      |
| Documentação     | Swagger UI                 |
| Testes           | JUnit 5 + Mockito          |

## 🔧 Requisitos Técnicos
### ✔️ Obrigatórios
- Armazenamento em memória (sem banco de dados)
- Validação de transações conforme regras de negócio
- Três endpoints funcionais:
  - `POST /transacao`
  - `GET /estatistica` 
  - `DELETE /transacao`

### ✨ Diferenciais (opcionais)
- [X] Testes automatizados
- [X] Documentação Swagger
- [X] Health Check
- [ ] Dockerização

## 📊 Especificação dos Endpoints

### 1. POST `/transacao`
**Request:**
```json
{
  "valor": 150.75,
  "dataHora": "2024-03-20T10:30:00-03:00"
}

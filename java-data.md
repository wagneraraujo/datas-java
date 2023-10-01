## Datas Java

**Data-[hora]local**
ano-mês-dia-hora sem fuso horário

**Data-hora global**
ano-mês-dia com fuso horário

**duracação**
tempo decorrido entre duas data-horas

## Timezone
**GMT - Greenwich mean time**
- Horário de londes
- horário do padrão UTC
- Chamado tbm de Z time, zulu ti me

**Fusos relatios ao GMT/UTC**
- São Paulo: GMT-3
- Manaus: GMT-4
- Portugal: GMT+1

### Padrão Iso 8601
Formatos par ser usados na programação
- Sem hora efuso horário
- Com  horas e fuso h orários
- Data hora e fuso horario
- 2023-06-23T14:52:09-04:00
- 2023-06-23T14:52:09-04:00Z londers menos 4
- 2023-06-23T14:52:00.2342342Z fracao de segundos


### Operações importantes com data

#### Instanciação
- agora - data-hora
- texto iso - datahora
- texto formatado 
- dia, mes, ano, horario
- Obter dados de data local
- Calculos / datahora + tempo

## Datas com java
- LocalDate / para somente data local sem  horas
- LocalDateTime 
- Instant / para data hora global
- Duration
- ZoneId

### Operações importantes
Quando se instancia um objeto data hora e precisa lidar com ele, você não mexer diretamente
no objeto instanciado, e sim, vai criar um outro objeto alterado




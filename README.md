
Olá boa noite a todos, epsero que todos estejam bem
eu vou falar sobre o eventLog analyzer que
é uma ferramenta de siem - gerenciamento de infromações e eventos de segurança 

EventLog é uma Solução que vai centralizar infromções de eventos de varias fontes ex: servidores, equipamentos,
aplicações.
e fazer com que a empresa aproveite o maximo de informações geradas por esses dispositivos em tempo real,
e conseguir filtrar aquelas infromações que são essenciais pra organização e de forma segura.
vai fazer o tratamento e salvar essas informações para gerar relatorios, alertas.
tudo isso dentro de uma interface web dinamica 
além dele ter uma rapida curva de aprendizado sobre a solução
ele também vai ter a facilidade de encontrar os items que ele precise
deixando processo mais agil dentro da organização

 FONTE DE EVENTOS: EM SETTINGS  #1 ==============================================================================================

//ir em settings

- existe uma série de fontes desses eventos que podem ser utilizadas para gerar informações, 
como dispositivos, aplicações, banco de dados, syslog, integridade de arquivos

- a solução vai fazer o tratamento e salvar essas informações para gerar relatorios, alertas (navegar no seetings)
-  Suporte a diversos dispositivos como windowns linux juniper, vmware 
 // ir em adicionar dispositico, 
 -pode descobrir a instancia ou adicionar manualmente,
 ele já cria as politicas e realiza a configutação
- no caso do windowns ela faz uma varredura de wmi que é o protocolo do windonws linux é o syslog
e traz a listagem de eventos e vão aparecer no dashboard (mostrar um pouco do dashboard)

// acessar os eventos e mostrar um pouco dos eventos e de filtragem,
 
- na integridade de arquivos é necessario um agente na maquina
 e ele fornece esse agente

// mostrar adição de integridade de arquivos no settings, qual dispositivo

e sobre adicionar pastas quer auditar

# CORRELAÇÃO DE EVENTOS - Correlation #2  ==============================================================================================

Pewrmite que você correlacione eventos e gere relatorios 
//ir na aba de manage rulçes
//dar exemplo de acesso de força bruta, falha de logon varias vezes e uma em seguida com sucesso
//ostrar um exemplo no copy do bruteforce e que pode cria um novo
//instalação de aplicações, deleção de arquivos


RELATORIOS:  #3 ==============================================================================================

//clicar na caixinha no canto inferior direito falar sobre persolanizar o que aoarece nas colunas
//mostrar os filtros por exemplo de mensagem
//  você pode exportar um relatorio
// e os filtros no funil
// e o periodo
//mostrar que pode criar um top na engrenagem a direita  os usuario 
que geraram mais eventos

- VOCE CONSEGUE TER UM CONTROLE SOBRE TUDO QUE TA ACONTECENDO NO AMBITO DE EVENTOS DENTRO DA ORGANIZAÇÃO 

 // deixar relatorio já especifico sobre um evento no important events no 
windowns events - important events - add - reports, COMO IF ELSE
// no more mostrar que pde adicionar o grafico no dashboard
// programar o relatorio para ser enviado por email relugarmente no schedule report
 


#ALERTAS #4  ============================================================================================== 
Assim que identifica o criterio do evento ele alerta sobre eventos 
pode enviar por email e exibir no navegador

WORKFLOW: 
Cria ações que acontecem quando o evento acontece
modo if else
no menage profile em editar


#BUSCA DE LOGS PERSONALIZADAS ABA - SEARCH ==============================================================================================

NÃO TA DENTRO DO RELATORIO MAS TA NA LISTAGEM DE EVENTOS

ir na aba search e mostrar topos de busca, tipos de logs
quando precisar de um event especifico ou na hora          
gerar um facil alerta e relatorio 
não precisa ver qual dispositivo gerou alerta e sim fazer uma busca avançada 

# Criando Vms no Azure
Uma **máquina virtual (VM)** é um ambiente de computação simulado que opera como um computador físico dentro de um sistema host (o hardware físico real). Em termos simples, é um software que emula um computador completo, incluindo o sistema operacional, armazenamento, rede e outros componentes.

## Características de uma Máquina Virtual
* **Isolamento**: Cada VM funciona de forma independente, como se fosse um computador separado, mesmo que esteja rodando em um hardware compartilhado. Isso garante que problemas em uma VM não afetem as outras.

* **Virtualização**: As VMs são criadas usando uma tecnologia chamada virtualização, que permite que vários sistemas operacionais rodem simultaneamente em um único hardware físico. A virtualização é gerenciada por um software chamado hipervisor (como o Hyper-V, VMware, ou VirtualBox).

* **Sistema Operacional Convidado**: Cada VM possui seu próprio sistema operacional, que pode ser o mesmo ou diferente do sistema operacional do hardware físico.

* **Recursos Virtualizados**: A VM utiliza recursos virtuais, como CPU, memória, armazenamento e rede, que são alocados do hardware físico do host. Esses recursos podem ser ajustados conforme as necessidades.

## Benefícios de Usar Máquinas Virtuais:

* **Flexibilidade e Escalabilidade**: As VMs podem ser rapidamente criadas, clonadas, movidas e escaladas de acordo com as necessidades de negócio.

* **Custo-Efetividade**: Utiliza melhor os recursos do hardware, reduzindo a necessidade de múltiplos servidores físicos.

* **Facilidade de Gerenciamento**: É mais fácil gerenciar e manter VMs, pois elas podem ser criadas a partir de imagens padronizadas e rapidamente atualizadas.

* **Testes e Desenvolvimento**: Desenvolvedores podem usar VMs para criar ambientes de teste sem afetar o sistema principal, facilitando a experimentação e o desenvolvimento.

* **Segurança**: Por estarem isoladas, VMs oferecem uma camada adicional de segurança; falhas ou ataques em uma VM não impactam outras VMs ou o sistema host.

## Aplicações Comuns de Máquinas Virtuais:
* **Hospedagem de Aplicações**: Hospedagem de websites, bancos de dados e outras aplicações empresariais.

* **Ambientes de Teste e Desenvolvimento**: Permitem testar novos softwares e sistemas operacionais sem comprometer o ambiente de produção.

* **Execução de Software Legado**: Rodar aplicações antigas que exigem sistemas operacionais obsoletos.

* **Cloud Computing**: VMs são a base de serviços de computação em nuvem, como Azure, AWS, e Google Cloud, permitindo que empresas aloquem recursos conforme necessário.

# Guia para Criar Máquinas Virtuais no Azure
Este guia ensina como criar máquinas virtuais no Azure, desde o acesso ao portal até a configuração e conexão à sua nova VM.

## Requisitos
* Conta no Portal do Azure.
* Permissões para criar recursos na sua assinatura do Azure.

## Passo a Passo
### 1. Acessar o Portal do Azure
1. Acesse portal.azure.com.
2. Faça login com sua conta do Azure.
### 2. Criar um Recurso
1. No painel lateral, clique em Criar um recurso.
2. Na seção de Computação, selecione Máquina Virtual.
### 3. Configurar a Máquina Virtual
Preencha as informações básicas:

* **Assinatura**: Escolha a assinatura apropriada.
* **Grupo de Recursos**: Selecione um existente ou crie um novo.
* **Nome da Máquina Virtual**: Dê um nome significativo à VM, como MinhaVM01.
* **Região**: Selecione a localização do data center mais próximo de você ou que atenda melhor suas necessidades.
* **Imagem**: Escolha o sistema operacional desejado, como Windows Server, Ubuntu, etc.
* **Tamanho**: Escolha o tamanho (CPU e memória). O Azure mostra sugestões com base na carga de trabalho.
* **Usuário Administrador**: Defina um nome de usuário e senha ou configure uma chave SSH para acesso seguro.
### 4. Configurações de Rede
* **Rede Virtual**: Use uma rede existente ou crie uma nova.
* **Sub-rede**: Selecione ou crie uma sub-rede para a VM.
* **Endereço IP Público**: Configure um endereço IP público se precisar acessar a VM externamente.
* **Grupo de Segurança de Rede**: Configure regras para portas (como RDP para Windows ou SSH para Linux).
### 5. Revisar e Criar
1. Revise todas as configurações feitas.
2. Clique em Criar para iniciar o processo de criação da máquina virtual.
3. Aguarde até que a implantação seja concluída. Isso pode levar alguns minutos.
### 6. Acessar a Máquina Virtual
Após a criação, você pode acessar a VM:

* **Windows**: Use um cliente RDP (Remote Desktop Protocol) com o endereço IP público e as credenciais configuradas.
* **Linux**: Acesse via SSH usando o comando ssh usuario@ip-publico no terminal.
## Dicas e Boas Práticas
* **Segurança**: Use senhas fortes e considere desativar o acesso direto por senha, optando por autenticação por chave SSH.
* **Monitoramento**: Configure o Azure Monitor para acompanhar o desempenho e a integridade da VM.
* **Custos**: Escolha tamanhos de VM adequados para balancear desempenho e custo.


print('ROCK PAPER SCISSOR GAME')


while True:
    player1 = input('Enter your choice for Player1').lower()
    player2= input('Enter your choice for Player2').lower()

    if(player1 == player2):
        print('Its a Tie!!')
    elif(player1=='rock'):
        if(player2=='scissors'):
            print(f'Winner is player1 - {player1}')
        elif(player2=='paper'):
            print(f'Winner is Player2 - {player2}') 
    elif(player1=='scissors'):
        if(player2=='rock'):
            print(f'Winner is Player2-{player2}') 
        elif(player2=='paper'):
            print(f'Winner is player1 - {player1}')
    elif(player1=='paper'):
        if(player2=='scissors'):
            print(f'Winner is Player2-{player2}') 
        elif(player2=='rock'):
            print(f'Winner is player1 - {player1}')
    else:
        print('Invalid Input!') 

    ask= str(input("Do you want to play another the game?- Yes/No")).lower()
    if(ask == 'yes'):
        pass
    elif(ask=='no'):
        raise SystemExit
    else:
        print('Invalid Input!')
        raise SystemExit





   











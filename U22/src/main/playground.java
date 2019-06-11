package main;

public class playground
{
	static int[][] textmain = new int[7][3];
	static int[][] textsub = new int[4][3];
	static int[][] p1_card = new int[3][8];
	static int[][] p2_card = new int[3][8];

	public static void main(String[] args)
	{

		//攻撃
		p1_card[0][0] = 1;//カードID
		p1_card[0][1] = 2;//コスト
		p1_card[0][2] = 4;//ダメージ
		p1_card[0][3] = 17;//以下、対応ID
		p1_card[0][4] = 19;
		p1_card[0][5] = -1;
		p1_card[0][6] = -1;
		p1_card[0][7] = -1;

		//攻撃
		p1_card[1][0] = 5;//カードID
		p1_card[1][1] = 4;//コスト
		p1_card[1][2] = 8;//ダメージ
		p1_card[1][3] = 12;//以下、対応ID
		p1_card[1][4] = 18;
		p1_card[1][5] = -1;
		p1_card[1][6] = -1;
		p1_card[1][7] = -1;

		//防御
		p1_card[2][0] = 12;//カードID
		p1_card[2][1] = 1;//コスト
		p1_card[2][2] = 0;//ダメージ
		p1_card[2][3] = 3;//以下、対応ID
		p1_card[2][4] = 5;
		p1_card[2][5] = 6;
		p1_card[2][6] = 8;
		p1_card[2][7] = 11;

		//攻撃
		p2_card[0][0] = 3;//カードID
		p2_card[0][1] = 3;//コスト
		p2_card[0][2] = 6;//ダメージ
		p2_card[0][3] = 12;//以下、対応ID
		p2_card[0][4] = 15;
		p2_card[0][5] = -1;
		p2_card[0][6] = -1;
		p2_card[0][7] = -1;

		//防御
		p2_card[1][0] = 17;//カードID
		p2_card[1][1] = 4;//コスト
		p2_card[1][2] = 0;//ダメージ
		p2_card[1][3] = 1;//以下、対応ID
		p2_card[1][4] = 4;
		p2_card[1][5] = 10;
		p2_card[1][6] = -1;
		p2_card[1][7] = -1;

		//防御
		p2_card[2][0] = 15;//カードID
		p2_card[2][1] = 3;//コスト
		p2_card[2][2] = 0;//ダメージ
		p2_card[2][3] = 3;//以下、対応ID
		p2_card[2][4] = 6;
		p2_card[2][5] = -1;
		p2_card[2][6] = -1;
		p2_card[2][7] = -1;

		for (int i = 0; i < p1_card.length; i++)
		{
			//－１でなければ、使ったカードIDが入っている
			if (p1_card[i][0] != -1)
			{
				//対応IDから調べるためのループ
				for (int j = 3; j < p1_card[0].length; j++)
				{
					//対応IDがー１でなければ、そのIDに対応している
					if (p1_card[i][j] != -1)
					{
						//その対応IDが敵の使ったカード含まれているかどうかを調べるためのループ
						for (int k = 0; k < p2_card.length; k++)
						{
							if (0 <= p1_card[i][0] && p1_card[i][0] < 12)
							{

							}
						}
					}
				}
			}
		}
		for (int i = 0; i < textmain[0].length; i++)
		{
			System.out.print(" " + textmain[4][i]);
		}
		System.out.println("");
		for (int i = 0; i < textmain[0].length; i++)
		{
			System.out.print(" " + textmain[6][i]);
		}
	}

}

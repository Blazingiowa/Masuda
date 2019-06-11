package main;

public class test
{
	//デバック用
	//0,-1,-1
	/*-1,-1,-1
	-1,-1,-1
	-1,-1,-1
	-1,-1,-1
	-1,-1,-1
	-1,-1,-1
	-1,-1,-1*/

	static int[] textW;//テキストファイルの内容を一時的に避難させるための１次元配列
	static int w;//みんな大好き一時退避変数だよ！＜＜０にｗを代入＞＞
	static int[][] textmain = new int[3][3];//避難させた内容を格納するための配列
	static int[] playerinfo = new int[3];
	static int[] usecard = new int[3];

	public static void main(String[] args)
	{
		Text tx = new Text();

		textreset();

		/*textW[0] = 0;
		textW[1] = -1;
		textW[2] = -1;*/
		usecard[0] = 6;
		usecard[1] = 8;
		usecard[2] = 10;
		playerinfo[0] = 1;
		playerinfo[1] = 1;//ルーム
		playerinfo[2] = 1;//人番号

		//テキストファイルを検索[ルームID][ユーザ番号][行数][書0、読1][書き込みたい配列、読みはnull]
		textW = tx.editer(playerinfo[1], playerinfo[2], 0, 1, null);

		//プレイヤーの処理が終わっているのかどうか（０はまだ、１で処理済み）
		if (textW[0] == 0)
		{
			for (int i = 0; i < textmain.length; i++)
			{
				textW = tx.editer(playerinfo[1], playerinfo[2], i, 1, null);

				//テキストには初期で入ってるデータを配列に入れる
				for (int j = 0; j < textW.length; j++)
				{
					w = textW[j];
					textmain[i][j] = w;
					System.out.print("" + textmain[i][j]);
				}
				System.out.println("");

			}

			textmain[0][0] = 1;//とりあえず、処理済みにデータを変更
			//for文を使って２次元配列を１次元配列に退避し、テキストファイルに書き込む
			for (int i = 0; i < textmain.length; i++)
			{
				if (i == 1)//１行目の時が自分が使ったカードの情報
				{
					for (int j = 0; j < textmain[1].length; j++)
					{
						w = usecard[j];
						textW[j] = w;
					}
				}
				else//それ以外の時は退避用変数に入れて、そこから１次元配列にデータを入れてテキストに書き込む
				{
					for (int j = 0; j < textmain[1].length; j++)
					{
						w = textmain[i][j];
						textW[j] = w;
					}
				}
				tx.editer(playerinfo[1], playerinfo[2], i, 0, textW);
			}
		}
	}
	//textの初期化（使わないデータの場所には-1）
	static void textreset()
	{
		for (int i = 0; i < textmain.length; i++)
		{
			for (int j = 0; j < textmain[0].length; j++)
			{
				textmain[i][j] = -1;
			}

		}
	}

}

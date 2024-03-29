# 第5回課題
## URL(Uniform Resource Locator)
 > インターネット上のWebサイトやファイルの位置や情報を示すもの。
>  ユーザーがサーバー側にWebページなどリクエストする際に必要な情報。<br>
 > URL例： https://www.kimyasu.co.jp<br>
 > 「https」(Hypertext Transfer Protocol Security)はどんなOS、ブラウザの環境であっても問題なくWebサイトが表示できるようにする通信規格、共通ルール（データ形成・伝送単位、エラー対処等）のこと。<br>
 > 「www.kimyasu.co.jp」www(World Wide Web)は、Webを示すサブドメインで、kimyasu.co.jpは親ドメインで、2つ合わせたものはホスト名と呼ばれWebサイトの場所を示している。
 > 
## クエリ文字列
 > サーバーに送る追加情報としてURLの末尾に付け足す文字列（変数）のこと。末尾に「?○=●」つけ、○にはパラメータ名、●にはパラメータ値を入力し、複数のパラメータがある場合は「&」で繋ぐ。
 > 「アクティブパラメータ」と「パッシブパラメータ」の２種類あり、「アクティブパラメータ」は検索結果を表示させたり、ログイン画面を表示させたり、ユーザーによって異なる情報やWebページが表示されるようにするために使用し、
 「パッシブパラメータ」は情報収集やデータ分析を目的にどこから来たか、Webサイトにどのくらい滞在したか情報収集する。
 > 
## パス変数（パスパラメーター）
 > パスとはソフトウェアが配置されている場所までのフォルダ階層の道筋。  
 > パス変数とは、URLのパスの一部を利用する変数のこと。特定のユーザーや記事情報を表示するために活用されている。<br>
　http://○△×□.jp/user/1 <br>
  上記URLの「1」の部分のこと。

## クエリ文字列とパス変数の違いとは
 > パス変数は、特定のものを表示したいときに必要。例：ユーザーID  
 > クエリ文字列は特定のものに条件を加える場合（複数条件）に必要。例：検索条件を指定する場合
 > URLの書き方も上記に記した通り違いがある。
## HTTPメソッドとは
 > HTTPリクエストの一部であるリクエスト行に含まれ、HTTPでクライアントからサーバへ何をしたいかを伝えるもの。要求ごとに種類があり、文字で表されている。
 > HTTPリクエストはリクエストライン、リクエストヘッダー、リクエストボディの3つからなる。
 > 以下はHTTPメソッドの種類。

|HTTPリクエスト|内容|
|---|---|
|GET|情報を取得する（Webサイト、画像データの表示等）|
|POST　|新しい情報を送信する（アカウントの新規作成、ブログやWebサイト上の質問フォームを投稿する等）|
|PUT|新しい情報で置き換える（更新・上書き）（既存アカウントをすべて新しい情報で置き換えて送信する等）|
|PATCH|情報の一部を新しい情報で書き換える（既存アカウントに一部追加情報を加えて送信する等）|
|DELETE|情報を削除する（既存アカウントの削除、既存ブログ記事の削除等）|


## リクエストヘッダー
 > クライアントからサーバーに送信するHTTPリクエストの一部分。
 > 様々な情報が記載されており、「User-Agent」(クライアント自身のブラウザやバージョン、OS等）、「Accept」（どのようなデータの形式を要求しているのか）等の詳細な情報がある。

## HTTPステータスコード
 > HTTPリクエストに対するサーバーからクライアントへの返答であるHTTPレスポンスに含まれる処理結果を表現する３桁の数字のこと。  
 > HTTPレスポンスは、HTTPステータスライン、レスポンスヘッダー、レスポンスボディの3つからなる。<br>
 > 100番台・・・処理が継続されている状態<br>
 > 200番台・・・正常に処理された状態<br>
 > 300番台・・・正常に処理されるために他の処理が必要と返答されている状態<br>
 > 400番台・・・ページが存在しないため処理ができない状態<br>
 > 500番台・・・サーバーに問題があり処理できない状態<br>
 > 以下はHTTPステータスコードの種類。

|HTTPステータスコード|結果|
|---|---|
|200|リクエストが正常に処理できた|
|201|リクエストが成功してリソースの作成が完了（POSTやPUTリクエストに対して）|
|400|リクエスト内容に問題がある等、クライアント側に問題があるため処理できない状態|
|404|Webサイトが存在しない、アクセス権がない等によりエラーが生じている状態|
|500|サーバ内で問題が発生し、エラーが生じている状態|

## レスポンスヘッダー
> HTTRレスポンスを構成する１つで、HTTPステータスラインに書ききれない制御情報が書かれている。 
> リクエストヘッダと同様で様々な情報が記載されており、「Content-Type」（要求された情報の種類や形式を表すもの）や「Expires」（得たデータを、サーバーに再度依頼しなくてもブラウザが再利用可能な期限）等の詳細な情報がある。
## レスポンスボディ
 > HTTPレスポンスの一部で、リクエストで要求したデータ本体（HTMLファイルやCSS、JSON等）の情報が書かれている。
## JSON
 > JavaScriptのオブジェクト記法を用いたデータの記述形式の1つ。
 > 様々な言語で使われており、JSONを間に挟むことでデータのファイル保存や各プログラミング言語間のデータの受け渡しが簡単にできる。
```json
{
"total": 5,
"mascot": [
    {"id": 1,
     "name": "Okazaemon",
     "fromAichi": true
    },
    {"id": 2,
     "name": "Aisai-san",
     "fromAichi": true
    },
    {"id": 3,
     "name": "kyabezo",
     "fromAichi": true
    },
    {"id": 4,
     "name": "Wanmaru-kun",
     "fromAichi": true
    },
    {"id": 5,
     "name": "Barii-san",
     "fromAichi": false
    }
]
}
```




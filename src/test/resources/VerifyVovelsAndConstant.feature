Feature: Verify the Vowels and consonant Count

  Scenario Outline:: verify Vowels in the String(Positive Scenario)
    Given User call Vowels Function with String as "<Sentence>"
    Then Verify count of Vovels and consonant and count as "<count>"

    Examples:
      | Sentence                          | count                   |
      | kunal,kunal1234,1234kunal,k@#$%^& | [2,3]#[2,3]#[2,3]#[0,1] |
      | aaaaaa,@#$%^,/iuo,k@#$%^&         | [3,0]#[0,0]#[3,0]#[0,1]       |
      | MMMMMMMM,1234567890,1234567890-,  | [0,0]#[0,0]#[0,0]       |


  Scenario Outline:: verify Vowels in the String greater than 4 Length(Negative Scenario)
    Given User call Vowels Function with String as "<Sentence>"
    Then Verify count of Vovels and consonant and count as "<count>"

    Examples:
      | Sentence                                        |count|
      | kunal,kunal1234,1234kunal,k@#$%^&,gajsgjasgjfa  |     |
      | aaaaaa,@#$%^,/iuoewtyyew,k@#$%^&,fdhfjkdsfhdskf |     |
      | MMMMMMMM,1234567890,1234567890-,nmjklkalsa      |     |


  Scenario Outline:: verify Vowels in the String  0 Length(Negative Scenario)
    Given User call Vowels Function with String as "<Sentence>"
    Then Verify count of Vovels and consonant

    Examples:
      | Sentence |count|
      |          |     |

  Scenario Outline:: verify Vowels in the String with duplicate(Negative Scenario)
    Given User call Vowels Function with String as "<Sentence>"
    Then Verify count of Vovels and consonant

    Examples:
      | Sentence    |count|
      | kunal,kunal |     |



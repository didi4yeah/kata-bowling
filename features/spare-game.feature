Feature: Play Bowling

  Scenario Outline: Calcul complet score nul
    Given le joueur a fait une partie avec les tirs suivants "<tirs>"
    When on calcule son score
    Then le score est <score>

    Examples:
      | tirs | score |
      | --,--,--,--,--,--,--,--,--,-- |  0  |
Feature: Play Bowling

  Scenario Outline: Calcul complet score nul
    Given le joueur a fait une partie avec les tirs suivants "<tirs>"
    When on calcule son score
    Then le score est <score>

    Examples:
      | tirs | score |
      | --,--,--,--,--,--,--,--,--,-- |  0  |

  Scenario Outline: Calcul complet score non nul
    Given le joueur a fait une partie avec les tirs suivants "<tirs>"
    When on calcule son score
    Then le score est <score>

    Examples:
      | tirs | score |
      | 12,23,11,22,44,51,61,11,22,31 | 45 |

  Scenario Outline: Calcul complet score non nul avec gouttière
    Given le joueur a fait une partie avec les tirs suivants "<tirs>"
    When on calcule son score
    Then le score est <score>

    Examples:
      | tirs | score |
      | 1-,23,11,2-,44,51,61,1-,22,-1 | 37 |

  Scenario Outline: Calcul complet score avec spare
    Given le joueur a fait une partie avec les tirs suivants "<tirs>"
    When on calcule son score
    Then le score est <score>

    Examples:
      | tirs | score |
      | 11,23,11,2/,44,51,61,11,22,11 | 54 |


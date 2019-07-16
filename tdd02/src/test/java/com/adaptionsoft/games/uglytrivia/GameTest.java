package com.adaptionsoft.games.uglytrivia;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wenws
 * @date 2019/7/13.
 * description：
 */
public class GameTest {

    //掷骰子6次且6次答题对， game over
    @Test
    public void the_game_should_over_if_a_player_rolls_the_dice_and_answer_each_question_correctly_for_6_times() {
        //Arrange
        Game game = new Game();
        game.add("Chet");
        boolean isGameStillInProgress = true;
        //Act
        for (int i = 0; i < 6; i++) {
            game.roll(1);
            isGameStillInProgress = game.wasCorrectlyAnswered();
        }
        //Assert
        assertFalse(isGameStillInProgress);
    }

    //第一次掷骰子答题就错了，接下来的一次是奇数，且后买5次答题对 game over
    @Test
    public void the_game_should_be_over_if_a_player_rolls_the_dice_for_7_times_and_answer_the_question_wrongly_for_1_time_followed_by_an_odd_rolling_number_bug_then_correctly_for_6_times() {

        //Arrange
        Game game = new Game();
        game.add("Chet");
        boolean isGameStillInProgress = true;
        //Act
        game.roll(1);
        game.wrongAnswer();
        game.roll(1);
        game.wasCorrectlyAnswered();
        for (int i = 0; i < 5; i++) {
            game.roll(1);
            isGameStillInProgress = game.wasCorrectlyAnswered();
        }
        //Assert
        assertFalse(isGameStillInProgress);

    }

    //第一次掷骰子答题错了，接下来一次是偶数，没有答题，后6次答对　game over
    @Test
    public void the_game_should_be_over_if_a_player_rolls_the_dice_for_8_times_and_answer_the_question_wrongly_for_1_time_followed_by_an_even_rolling_number_but_then_correctly_for_7_times_with_odd_rolling_number() {
        //Arrange
        Game game = new Game();
        game.add("Chet");
        boolean isGameStillInProgress = true;
        //Act
        game.roll(1);
        game.wrongAnswer();
        game.roll(2);
        for (int i = 0; i < 6; i++) {
            game.roll(1);
            isGameStillInProgress = game.wasCorrectlyAnswered();
        }
        //Assert
        assertFalse(isGameStillInProgress);
    }

}
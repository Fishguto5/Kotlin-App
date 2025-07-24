package org.example.driver
import org.example.teams.Team


public class Driver (val name: String) {
    private var _age: Int? = null;
    private lateinit var _team:Team
    private var _number: Int? = null 

    constructor(name: String,age: Int, team: Team,number: Int): this(name) { //construtor secundário
        this._age = age
        this._team = team
        this._number = number
    }

    var age: Int //getter e setter da variável age
    get() = _age!!
    set(value) {
        this._age = value
    }

    var team: Team //getter e setter da variável team
    get() = _team!!
    set(value) {
        this._team = value
    }

    var number: Int ///getter e setter da variável number
    get() = _number!!
    set(value) {
        this._number = value
    }

}
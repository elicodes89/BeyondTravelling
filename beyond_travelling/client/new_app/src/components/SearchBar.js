import React, {useState} from "react";

const SearchBar = () =>{

    <form action="/" method="get">
    <label htmlFor="header-search">
        <span className="visually-hidden">Search regions and cities</span>
    </label>
    <input
        type="text"
        id="header-search"
        placeholder="Search regions and cities"
        name="s"
    />
    <button type='submit'>Search</button>
</form>



    const [searchInput, setSearchInput] = useState("");

    const regions = [
        {name: "England", city:"London"},
        {name: "England", city:"Birmingham"},
        {name: "England", city:"Manchester"},
        {name: "England", city:"Liverpool"},
        {name: "Scotland", city:"Edinburgh"},
        {name: "Scotland", city:"St Andrews"},
        {name: "Scotland", city:"Skye"},
        {name: "Scotland", city:"Inverness"},
        {name: "Scotland", city:"Dundee"},
        {name: "Wales", city:"Newport"},
        {name: "Wales", city:"Swansea"},
        {name: "Wales", city:"Cardiff"},
        {name: "Wales", city:"Liverpool"},
        {name: "Ireland", city:"Dublin"},
        {name: "Ireland", city:"Belfast"},
        {name: "Ireland", city:"Donegal"},
        {name: "Ireland", city:"Galway"},
    ];

    const handleChange = (event) =>{
        event.preventDefault();
        setSearchInput(event.target.value);
    };

    if (searchInput.length > 0) {
        regions.filter((region) =>{
            return region.name.match(searchInput);
        });
    }

    return(
        <>
        <div className="searchbar">
        <input 
        type="search"
        placeholder="Search here"
        onChange={handleChange}
        value={searchInput} />

        <table>
        <tr>
            <th>Region</th>
            <th>City</th>
        </tr>
        
        {regions.map((region,index) => {

        <div>
            <tr>
                <td>{regions.name}</td>
                <td>{regions.city}</td>
            </tr>
        </div>

        })}

        </table>
        </div>
        </>
    )
}

export default SearchBar;
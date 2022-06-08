import React, { useState, useEffect } from 'react';
import HotelList from './HotelList';
// import './MainPage.css';

const AccessibleHotels = () => {
    const [regions, setRegions] = useState([]);

    useEffect(() => {
        getRegions();
    }, [])

    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))
    }

    // function task(){
    //     console.log(getRegions)
    // }
    // setTimeout(task, 1000);

    return (
        <>     
        <h3>Please choose a region</h3>

        <div className="main-container">
            <HotelList regions={regions}/>
        </div>
        </>

    );
};

export default AccessibleHotels;





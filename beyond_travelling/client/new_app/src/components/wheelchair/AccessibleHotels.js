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

    return (
        <div className="main-container">
            <HotelList regions={regions}/>
        </div>
    );
};

export default AccessibleHotels;





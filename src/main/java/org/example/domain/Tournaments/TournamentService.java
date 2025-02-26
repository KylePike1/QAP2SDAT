package org.example.domain.Tournaments;

import org.example.domain.Member.Member;
import org.example.domain.Member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    @Autowired
    private MemberRepository memberRepository;

    public Tournament addTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    public Iterable<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }

    public Optional<Tournament> getTournamentById(Long tournamentId) {
        return tournamentRepository.findById(tournamentId);
    }

    public Tournament findByTournyName(String tournamentName) {
        return tournamentRepository.findByTournamentName(tournamentName);
    }

    public Optional<Tournament> getTournamentByLocation(String location) {
        return tournamentRepository.findByLocation(location);
    }

    public Optional<Tournament> getTournamentByStartDate(Date startDate) {
        return tournamentRepository.findByStartDate(startDate);
    }

    public List<Member> getMembersByTournament(Long tournamentId) {
        return tournamentRepository.findById(tournamentId)
                .map(Tournament::getMembers)
                .orElse(Collections.emptyList());
    }
}